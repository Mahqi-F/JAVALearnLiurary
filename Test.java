public class Test{
    public static void main(String[] args) {
      int salary, nCars, nHouses;
      salary = 6000;
      nCars = 0;
      nHouses = 0;
      DayDreaming(salary, nCars, nHouses);
      System.out.println(salary +" "+ nCars+" "+ nHouses);
    }
    static void DayDreaming(int salary, int cars, int houses)
    {
      salary = salary * 3;
      cars +=2;
      houses++;
    }
  }
  