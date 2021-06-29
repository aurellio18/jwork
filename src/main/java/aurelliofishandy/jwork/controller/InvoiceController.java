package aurelliofishandy.jwork.controller;

import aurelliofishandy.jwork.*;import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.prefs.BackingStoreException;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/

@RequestMapping("/invoice")
@RestController
public class InvoiceController {
    
    /** 
     * @return ArrayList<Invoice>
     */
    @RequestMapping("")
    public ArrayList<Invoice> getAllInvoice(){
        return DatabaseInvoice.getInvoiceDatabase();
    }

    
    /** 
     * @param id
     * @return Invoice
     */
    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invc = null;
        try {
            invc = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
        return invc;
    }

    
    /** 
     * @param jobseekerId
     * @return ArrayList<Invoice>
     */
    @RequestMapping(value = "/jobseeker/{jobseekerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerId) {
        ArrayList<Invoice> invc = null;
        invc = DatabaseInvoice.getInvoiceByJobseeker(jobseekerId);
        return invc;
    }

    
    /** 
     * @param @RequestParam(value="id"
     * @return Invoice
     * @throws InvoiceNotFoundException
     */
    @RequestMapping(value = "/InvoiceStatus", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@RequestParam(value="id") int id,
                                       @RequestParam(value="invoiceStatus") InvoiceStatus invoiceStatus)
            throws InvoiceNotFoundException {
        DatabaseInvoice.changeInvoiceStatus(id, invoiceStatus);
        Invoice invc = DatabaseInvoice.getInvoiceById(id);
        return invc;
    }

    
    /** 
     * @param id
     * @return Boolean
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@PathVariable int id){
        try{
            DatabaseInvoice.removeInvoice(id);
        } catch (InvoiceNotFoundException e){
            e.getMessage();
            return false;
        }
        return true;
    }
    
    /** 
     * @param "jobIdList"
     * @return Invoice
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee){
        ArrayList<Job> job = new ArrayList<>();
        for (int jb : jobIdList) {
            try {
                job.add(DatabaseJob.getJobById(jb));
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            BankPayment invoice = new BankPayment(DatabaseInvoice.getLastId()+1, job,
                    DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), adminFee);
            invoice.setTotalFee();
            DatabaseInvoice.addInvoice(invoice);
            return invoice;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    
    /** 
     * @param "jobIdList"
     * @return Invoice
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") String referralCode){
        ArrayList<Job> job = new ArrayList<>();
        for (int jb : jobIdList) {
            try {
                job.add(DatabaseJob.getJobById(jb));
            } catch (JobNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            EwalletPayment invoice = new EwalletPayment(DatabaseInvoice.getLastId()+1, job,
                    DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByReferralCode(referralCode));
            invoice.setTotalFee();
            DatabaseInvoice.addInvoice(invoice);
            return invoice;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}