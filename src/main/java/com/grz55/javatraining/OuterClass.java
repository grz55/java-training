package com.grz55.javatraining;

public class OuterClass {

    int a = 1;

    public class InnerClass {
        int b = 2;
    }

    private class InnerSecond {
        String secret = "secret message from private inner class";

        public String getSecret() {
            return secret;
        }
    }

    static class InnerStatic {
        int d = 4;
    }

    public String showPrivateInnerSecond(){
        InnerSecond innerSecond = new InnerSecond();
        return innerSecond.getSecret();
    }

}
