/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noneentity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class DateFormat {
    public String getDateConvert(Date d) {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd yyyy - hh:mm:");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("a");
        String date = dateFormat1.format(d) + dateFormat2.format(d).toLowerCase();
        return date; 
    }
}
