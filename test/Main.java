    public static Object helloPromise = __M$Promise_Internal.PromiseValue.resolved("Hello");
    public static Object goodbyePromise = __M$Promise_Internal.PromiseValue.rejected("Goodbye");
    public static Object errPromise = __M$Promise_Internal.PromiseValue.rejected(new RuntimeException("err"));
    public static Object customErrPromise = __M$Promise_Internal.PromiseValue.rejected(java.util.Map.of("code", "err"));
