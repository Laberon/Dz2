public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Домашнее задание ниже");


        System.out.println("Задание 1");
        var a = 100;
        int b = 110;
        float c = 7;
        byte d = 13;
        double f = 3.1457987987; //не число ПИ
        short g = 6548;
        long h = 5645484624L;

        System.out.println("Задание 2");
        var men1 = 78.2;
        System.out.println("Вес первого боксера " + men1 + " кг!");
        var men2 = 82.7;
        System.out.println("Вес второго боксера " + men2 + " кг!");
        double menWeight = men1 + men2;
        System.out.println("Вес обоих боксеров " + menWeight + " кг!");
        double raznicaWeigth = men2 - men1;
        System.out.println("Разница в весе " + raznicaWeigth);


        System.out.println("Задание 3");
        var banana = 5;
        int bananaWeight = banana*80;
        var milk=200;
        int milkWeigtht=milk/100*105;
        var ice=2;
        int iceWeight=ice*100;
        var egg=4;
        int eggWeight=egg*70;
        int allWeigtht = bananaWeight+milkWeigtht+iceWeight+eggWeight;
        System.out.println("Вес продуктов " + allWeigtht + " грамм");
        float kg=1000;
        float weightKg=allWeigtht/kg;
        System.out.println("Вес продуктов в кг " +weightKg);


        System.out.println("Задание 4");
        double nujnoPohudet=7;
        double weigthGm=nujnoPohudet*kg; // double использую в слае если в будущем нужно похудеть на 7.5 кг
        int lightDay=250; // int в случае если худеть на есколько КГ
        int hardDay=500;
        double needDayLight=weigthGm/lightDay;
        double needDayHard=weigthGm/hardDay;
        System.out.println("Есил худеть на " +lightDay+" грамм, потребуется "+needDayLight+" дней!");
        System.out.println("Есил худеть на " +hardDay+" грамм, потребуется "+needDayHard+" дней!");


        System.out.println("Задание 5");
        int month=12;
        var povyshenieCherez=month*3;
        float uvelichit=0.1f;
        var mashaWork=4;
        int mashaPovysh=mashaWork*month;
        float mashaZp=67_760.f; //если добавятся копейки, пример ниже
        float uvelichenMa=mashaZp*uvelichit;
        if (mashaPovysh>povyshenieCherez)
            System.out.println("Теперь Маша получает " +(mashaZp+uvelichenMa)+ " рублей. Годовой доход вырос на "+uvelichenMa*month+ " рублей");
        var denisWork=5;
        float denisZp=83_690.01f;
        float uvelichenDe=denisZp*uvelichit;
        int denisPovysh=denisWork*month;
        if (denisPovysh>povyshenieCherez)
            System.out.println("Теперь Денис получает " +(denisZp+uvelichenDe)+ " рублей. Годовой доход вырос на "+uvelichenDe*month+ " рублей");
        var kristinaWork=6;
        int kristinaZp=76_230;
        double uvelichenKr=kristinaZp*uvelichit;
        int kristinaPovysh=kristinaWork*month;
        if (kristinaPovysh>povyshenieCherez)
            System.out.println("Теперь Кристина получает " +(kristinaZp+uvelichenDe)+ " рублей. Годовой доход вырос на "+uvelichenKr*month+ " рублей");
        var otherWork=2;
        int otherPovysh=otherWork*month;
        int otherZp=50000;
        double uvelichenOt=otherZp*uvelichit;
        if (otherPovysh>povyshenieCherez)
            System.out.println("Теперь остальные получают " +(otherZp+uvelichenOt)+ " рублей. Годовой доход вырос на "+uvelichenOt*month+ " рублей");
    }
}