/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rbatten.simplefan.dataobjects;

/**
 *
 * @author rbatten
 */
public class SimpleFanDO {
    //default settings for fan
    //going forward direction
    private  boolean isForward=true;
    //fan is not moving
    private FanSpeed currentSpeed=FanSpeed.OFF;

    //used to check/increase speed
    enum FanSpeed{
        OFF,LOWSPEED,MEDIUMSPEED,HIGHSPEED
    }
    
    //getter and setters for speed and direction
    private boolean isIsForward() {
        return isForward;
    }
    private FanSpeed getCurrentSpeed() {
        return currentSpeed;
    }
    private String getCurrentSpeedText(){
        return this.getCurrentSpeed().toString();
    }
    private String getDirectionalText(){
        return this.isForward ? "Forwards":"Backwards";
    }
    //public functions for changing speed and direction
    public void changeSpeed(){
        switch(this.getCurrentSpeed()){
            case OFF:
                this.currentSpeed = FanSpeed.LOWSPEED;
                break;
            case LOWSPEED:
                this.currentSpeed = FanSpeed.MEDIUMSPEED;
                break;
            case MEDIUMSPEED:
                this.currentSpeed = FanSpeed.HIGHSPEED;
                break;
            default:
                this.currentSpeed=FanSpeed.OFF;
                break;
        }
    }
    public void changeDirection(){
        this.isForward = !this.isIsForward();
    }
    //override toString method
    @Override
    public String toString(){
        return String.format("The fan speed is currently %s going in %s direction",this.getCurrentSpeedText(),this.getDirectionalText());
    }
}

