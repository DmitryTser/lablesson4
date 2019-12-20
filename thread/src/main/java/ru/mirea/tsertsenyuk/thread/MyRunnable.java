package ru.mirea.tsertsenyuk.thread;

import android.util.Log;

public class MyRunnable implements Runnable {
    private static final String TAG = MyRunnable.class.getSimpleName();
    private String goal;
    public MyRunnable(String goal) {
        this.goal=goal;
    }

    @Override
    public void run() {
        Log.d(TAG, " Mой поток запущен:" + goal);
        float count = 0;
        int s = 0;
        int[] lessons = new int[] {2, 3, 2, 4, 4, 4, 0, 4, 4, 4, 4, 2, 2, 0, 2, 3, 3, 2, 2, 2, 0, 2, 2, 4, 2, 2, 0, 0};
        for (int i = 0; i < lessons.length; i++){
            //    Log.w(TAG,"LESSON I:" + lessons[i]);
            s += lessons[i];
        }
        count = s/lessons.length;

        Log.w(TAG, "Среднее количество пар в день за месяц:" + count);
    }
}