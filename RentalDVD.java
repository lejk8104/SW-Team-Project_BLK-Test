
/**
 
 * @author (2018315056 우메모토 세이야, 2015225129 이재근, 2018315021 방대호) 
 * @version (2020/06/10)
 */
public class RentalDVD
{
    /**
     * 나이(0부터 150사이의 정수값), 가격(음수가 아닌 정수값), 
     * 대여 시작일로부터 경과된 시간(음수가 아닌 정수값)에 따라 할인된 가격을 출력해주는 메소드
     * Parameter: 나이, 가격, 대여 시작일로부터 경과된 시간
     * return: 할인 적용 후  가격
     */
    public static int calcRentalFee(int age, int fee, int period) {
        boolean isOldWork = false;
        if ((age > 150) || (age <0 ) || (fee <0) || (period <0))
            fee = -1;
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
