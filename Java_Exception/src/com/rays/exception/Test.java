package com.rays.exception;

class Test {

    protected void finalize() {
        System.out.println("Object destroy hone wala hai");
    }

    public static void main(String[] args) throws Exception {

        Test t = new Test();
        t = null;

        System.gc();

        Thread.sleep(2000);  // 2 sec wait
    }
}