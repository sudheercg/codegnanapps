package com.codegnan.threads.chefs;
class Chef extends Thread {
    private String dish;

    public Chef(String dish) {
        this.dish = dish;
    }

    public void run() {
        System.out.println("Chef is cooking " + dish);
        // Simulate cooking time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Chef finished cooking " + dish);
    }
}
