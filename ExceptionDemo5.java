public class ExceptionDemo5 {
    public static void main(String[] args) {
        //自己处理（捕获异常）
        //可以让程序继续执行，不会停止
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);//可能出现异常的代码
            System.out.println(2 / 0);//ArithmeticException
            String s = null;
            System.out.println(s.equals("32"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界力");//如果出现了ArrayIndexOutOfBoundsException 异常
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("看看我执行了吗？？？(#^.^#)");
    }
}
