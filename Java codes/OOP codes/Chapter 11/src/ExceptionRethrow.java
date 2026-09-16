public class ExceptionRethrow {
    public static void SomeMethod()
    {
        try {
            SomeMethod1();
        }catch (RuntimeException re)
        {
            throw new RuntimeException("Exception in SomeMethod");
        }
    }

    public static void SomeMethod1()
    {
        throw new RuntimeException("Exception in SomeMethod1");
    }

    public static void main(String[] args) {
        try {
            SomeMethod();
        } catch (RuntimeException re)
        {
            try {
                throw new RuntimeException("Exception in main Method");
            }catch (RuntimeException e)
            {
                StackTraceElement [] traceElements=e.getStackTrace();
                for (StackTraceElement element:traceElements) {
                    System.out.println(element.getFileName());
                    System.out.println(element.getLineNumber());
                    System.out.println(element.getMethodName());
                }
            }
        }


    }

}
