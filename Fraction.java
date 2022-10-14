public class Fraction {

    int numerator1;
    int denominator1;



    Fraction(int numerator1, int denominator1) {
        this.numerator1 = numerator1;
        this.denominator1 = denominator1;

    }


    void printFraction() {
        System.out.println("მოცემული წილადი არის :" +  this.numerator1 + "/" + this.denominator1);
        System.out.println("გამრავლების მეთოდი (1/3)*(1/3) :" + this.numerator1*this.numerator1 + "/" + this.denominator1* this.denominator1);
        System.out.println("მიმატების მეთოდი (1/3)+(1/3) :" + (this.numerator1 + this.numerator1) + "/" + this.denominator1);
        System.out.println("შეკვეცის მეთოდი კვეცავს მთელ რიცხვამდე  :" +this.numerator1 / this.denominator1);


    }

}

