interface olaCustomer{
    void bookCap();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void cancelCab();
    void addMoneyToWallet();
    void raiseTicket();
    void signup();
    void signIn();

}

interface olaDriver{
    void acceptbooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedback();
}

interface olaOwner{
    void getDriverRecords();
    void getReportByDriver();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomerFeedback();
    void addDriver();
    void removeDriver();
    void changEdriverStatus();
}

public class AbstractTest0 implements olaOwner,olaDriver,olaCustomer{
    public static void main(String[] args){
        olaCustomer cust = new AbstractTest0();
        olaDriver manoj = new AbstractTest0();
        manoj.
    }
    public void bookCab(){

    }
    public void findARide(){

    }
    public void rentCab
}


