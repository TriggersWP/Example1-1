public class MyClass {
      public static void main(String[] args) {

            long a = 1234L;
            int b = 567;
            int c = (int)a * b;  //ปกติผลลัพธ์ต้องเป็นชนิด long แต่เราเปลี่ยนชนิด long เป็น int ให้ตรงกับชนิดผลัพธ์ (c)
            System.out.print(c);
      }
}
