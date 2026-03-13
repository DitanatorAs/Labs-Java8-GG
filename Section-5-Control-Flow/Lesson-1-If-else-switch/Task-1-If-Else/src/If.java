public class If {
    public String dayOfWeek(int day) {
        String dayName;
        if (day == 1){
                dayName = "Понедельник";
            }else{if(day == 2){
                    dayName = "Вторник";
                }else{if(day == 3){
                        dayName = "Среда";
                    }else{if(day == 4){
                            dayName = "Четверг";
                        }else{if(day == 5){
                                    dayName = "Пятница";
                                }else{if(day == 6){
                                            dayName = "Суббота";
                                        }else{if(day == 7){
                                                dayName = "Воскресенье";
                                                }else{
                                                    dayName  = "Ошибка данных";
        }
        }
        }
        }
        }
        }
        }
        return dayName;
    }
}
