
/**
 * 여기에 Rental_DVD_Discount_rate_calculation 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class RentalDVD
{
    public static int calcRentalFee(int age, int fee, int period) {
        boolean isOldWork = false;
        if (6 <= period)
            isOldWork = true;
        if (isOldWork)
            fee *= 0.5;
        else if ((65 <= age) && (age <= 150))
            fee *= 0.8;
        else if ((0 <= age) && (age <= 18))
            fee *= 0.9;
        return fee;
    }
}
