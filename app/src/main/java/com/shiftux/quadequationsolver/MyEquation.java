package com.shiftux.quadequationsolver;

import android.view.View;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.shiftux.quadequationsolver.databinding.ActivityMainBinding;

//Data Source
//BaseObservable for it gives the Notifying property to the data binding library
public class MyEquation extends BaseObservable {
    String a;
    String b;
    String c;

    ActivityMainBinding binding;

    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void solveEquation(View view){
        int a= Integer.parseInt(getA());
        int b= Integer.parseInt(getB());
        int c= Integer.parseInt(getC());

        if(a!=0){
            double dis = b*b - 4*a*c;
            double x1, x2;
            if (dis>0){
                x1= (-b + Math.sqrt(dis))/(2*a);
                x2= (-b - Math.sqrt(dis))/(2*a);

                binding.sol.setText("Root is "+ x1 +" or "+ x2);
            } else if (dis<0) {
                binding.sol.setText("No Real Solution(Complex Roots)");
            }else{
                x1= -b/(2*a);
                binding.sol.setText("x= "+  x1 + ", Only one root.");
            }
        }else{
            Toast.makeText(view.getContext(), "This is a Linear Equation", Toast.LENGTH_SHORT).show();
        }
        
    }
    public MyEquation() {
    }
}
