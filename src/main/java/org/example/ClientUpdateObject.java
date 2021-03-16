package org.example;

import org.json.JSONArray;

public class ClientUpdateObject {
    private Integer roundNumber;
    private JSONArray arrW0;
    private JSONArray arrB0;
    private JSONArray arrW1;
    private JSONArray arrB1;

    public ClientUpdateObject() {
    }

    public ClientUpdateObject(Integer roundNumber, JSONArray arrW0, JSONArray arrB0, JSONArray arrW1, JSONArray arrB1) {
        this.roundNumber = roundNumber;
        this.arrW0 = arrW0;
        this.arrB0 = arrB0;
        this.arrW1 = arrW1;
        this.arrB1 = arrB1;
    }

    public Integer getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(Integer roundNumber) {
        this.roundNumber = roundNumber;
    }

    public JSONArray getArrW0() {
        return arrW0;
    }

    public void setArrW0(JSONArray arrW0) {
        this.arrW0 = arrW0;
    }

    public JSONArray getArrB0() {
        return arrB0;
    }

    public void setArrB0(JSONArray arrB0) {
        this.arrB0 = arrB0;
    }

    public JSONArray getArrW1() {
        return arrW1;
    }

    public void setArrW1(JSONArray arrW1) {
        this.arrW1 = arrW1;
    }

    public JSONArray getArrB1() {
        return arrB1;
    }

    public void setArrB1(JSONArray arrB1) {
        this.arrB1 = arrB1;
    }
}
