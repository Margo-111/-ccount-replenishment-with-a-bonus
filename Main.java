public class Main {
    public static void main(String[] args) {

        int CurrentAmount = 100;//текущий счет клиента
        int ReplenishmentAmount = 1000;//сумма для пополнения счета

        int RublesToGetBonus = 100;//минимальная сумма для определения бонуса
        int BonusAmount = ReplenishmentAmount / RublesToGetBonus;//вычиление суммы бонуса
        boolean BonusIsGot = ReplenishmentAmount >=1000;//условие, что бонус будет получен, если сумма пополнения>/= 1000
        int TotalAmountWithoutBonus = CurrentAmount + ReplenishmentAmount;
        //вычисление итоговой суммы после пополнения (без бонуса)
        boolean IsCalculatedWithoutBonus = false;
        int TotalAmountWithBonus = CurrentAmount + ReplenishmentAmount + BonusAmount;
        //вычисление итоговой суммы после пополнения (с бонусом)
        boolean AccountIsRefilled = true;

        if (BonusIsGot == true && AccountIsRefilled == true && IsCalculatedWithoutBonus == false) {
            System.out.println("Ваш счет пополнен и составляет:");
            System.out.println(TotalAmountWithBonus);
            System.out.println("Ваш бонус за пополнение счета от 1000 рублей составляет:");
            System.out.println(BonusAmount);
        } else {
            System.out.println("Ваш счет пополнен и составляет:");
            System.out.println(TotalAmountWithoutBonus);
        }
    }
}


