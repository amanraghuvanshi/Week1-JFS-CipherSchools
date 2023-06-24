public class EncapTest0 {
    public static void main(String[] args)  {
        Amazon customer = new Amazon();
        float payableAmount=customer.Transaction(1000);
        System.out.println("Total Payable " +payableAmount);
    }
}
class Amazon{
    void Transaction(float amt){
        GPay gpayObj = new Gpay();
        gpayObj.txnCharge=0;
        float totalAmount=amt+(amt+ gpayObj.txnCharge);return TotalAmount;
        return totalAmount;
    }
}
class GPay{
   private float txnCharge=0.5f;
   public void setTxnCharge(float newCharge){
    if (newCharge<=0.5f){
        System.out.println("Invalid TxnCharge");
        return;
    }

    txnCharge=newCharge;
   }
   public float getTxnCharge(){
    return txnCharge;
   }
}