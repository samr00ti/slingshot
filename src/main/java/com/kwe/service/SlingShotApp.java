package com.kwe.service;

import com.kwe.slingshot.model.SlingShot;

public class SlingShotApp {

    public SlingShotApp(){
        System.out.println ("Starting Slingshot app");

        SlingShot slingShot = new SlingShot("branch", "Rubber 1", "rocks");

        System.out.println (slingShot.toString());

        SlingShot slingshot2 = new SlingShot();
        System.out.println (slingshot2.toString());

        SlingShot slingShot1 = new SlingShot("Some branch", "Some rubber", "Some rock");
        System.out.println (slingShot1.toString());



    }

    public static void main (String args[]){
        SlingShotApp app = new SlingShotApp();

    }
}
