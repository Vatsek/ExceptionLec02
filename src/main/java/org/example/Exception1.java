package org.example;

public class Exception1 {
    public static void main(String[] args) {

//      получим NullPointerException
//        String name = null;
//        System.out.println(name.length());

//      Получим ClassCastException
//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);

//      Получим NumberFormatException
//        String number = "123fq";
//        int result = Integer.parseInt(number);
//        System.out.println(result);


//       Получим UnsupportedOperationException
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());
    int number = 1;
    try {
        number = 10 / 1;
        String test = null;
        System.out.println(test.length());
    } catch (ArithmeticException e) {
        System.out.println("Operation divide by zero not supported");
    } catch (NullPointerException e) {
        System.out.println("null pointer exception");
    } catch (Exception e) {
        System.out.println("Ошибка");
    }





    }
}