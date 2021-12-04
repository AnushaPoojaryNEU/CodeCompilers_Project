/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dwith
 */
public class Schedule {
    
    private int id;
    Map<Date, Map<String, Boolean>> dateSchedule;
    Map<Date, Map<String, Boolean>> sortedSchdule = new HashMap<>();
    
    public Schedule() {
        //   this.dateSchedule = ;
        Calendar c1 = Calendar.getInstance();
        // c1.add(Calendar.DATE, 1);
        // Date startDate = c1.getTime();

        Calendar c = Calendar.getInstance();
        //c.add(Calendar.DATE, 1);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String incDate = sdf.format(c.getTime());
        Calendar c2 = Calendar.getInstance();
        c2.add(Calendar.DATE, 1);

        int maxDay = c1.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int co = 0; co < maxDay; co++) {

            c.add(Calendar.DATE, 1);
            incDate = sdf.format(c.getTime());
            HashMap<String, Boolean> slotSchedule = new HashMap<>();
            slotSchedule.put("9 am", true);
            slotSchedule.put("10 am", true);
            slotSchedule.put("11 am", true);
            slotSchedule.put("5 pm", true);
            slotSchedule.put("6 pm", true);
            //System.out.println(incDate);
            if (dateSchedule == null) {
                dateSchedule = new HashMap<>();
            }
            try{
            dateSchedule.put(sdf.parse(incDate), slotSchedule); //   this.dateSchedule.put(date,timeList);
            }catch(ParseException e){
                e.printStackTrace();
            }
            // c2.add(, 1);

        }
        
//        try {
//             List<Date> sorted = new ArrayList<>(dateSchedule.keySet());
//             Collections.sort(sorted);
//        }
//        catch(ConcurrentModificationException e)
//        {
//            System.out.println("e" + e);
//        }
       
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Date, Map<String, Boolean>> getDateSchedule() {
        if (dateSchedule == null) {
            dateSchedule = new HashMap<>();
        }
        return dateSchedule;
    }

    public void setDateSchedule(Map<Date, Map<String, Boolean>> dateSchedule) {
        this.dateSchedule = dateSchedule;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getId());
    }
    
}
