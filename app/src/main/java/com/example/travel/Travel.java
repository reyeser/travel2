package com.example.travel;

public class Travel {

    Double exp;

    void CalcExp(double mtod, double mperg, double gas)
    {
        exp=(mtod/mperg)*gas;
    }
    double getExp()
    {
        return exp;
    }
}
