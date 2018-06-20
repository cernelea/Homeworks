
public class Practice {

    
    double sum , sumSpended,discountFloatingPoint;

    public Practice(double sum, double sumSpended) {
        this.sum = sum;
        this.sumSpended = sumSpended;
    }

    void discountCalculation(double sum, double sumSpended) {
       
        discountFloatingPoint=(sum-sumSpended)/sum*100;
      int discount=(int)discountFloatingPoint;
        System.out.println(discount);
        switch (discount) {
            case 1:
                discount = 1;
                System.out.println("Discount is equal to:" + discount);
                break;

            case 2:
                discount = 2;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 3:
                discount = 3;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 4:
                discount = 4;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 5:
                discount = 5;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 6:
                discount = 6;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 7:
                discount = 7;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 8:
                discount = 8;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 9:
                discount = 9;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 10:
                discount = 10;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 11:
                discount = 11;
                System.out.println("Discount is equal to:" + discount);
                break;

            case 12:
                discount = 12;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 13:
                discount = 13;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 14:
                discount = 14;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 15:
                discount = 15;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 16:
                discount = 16;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 17:
                discount = 17;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 18:
                discount = 18;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 19:
                discount = 19;
                System.out.println("Discount is equal to:" + discount);
                break;
            case 20:
                discount = 20;
                System.out.println("Discount is equal to:" + discount);
                break;

            default:

                System.out.println("Invalid Value");
                break;

        }

    }

}
