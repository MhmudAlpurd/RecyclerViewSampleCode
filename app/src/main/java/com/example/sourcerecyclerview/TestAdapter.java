package com.example.sourcerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {

    List<String> mylist;

    TestAdapter(List<String> list) {
        mylist = list;
    }


    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_recycler_item, parent, false);
        TestViewHolder holder = new TestViewHolder(V);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {

        String s = mylist.get(position);
        holder.txt.setText(s);



     /*switch (position){
         case 0:
             holder.txt.setText("pouya1");
             break;
         case 1:
             holder.txt.setText("Pouya 2");
             break;
         case 2:
             holder.txt.setText("Pouya 3");
             break;
         case 3:
             holder.txt.setText("Pouya 4");
             break;
         case 4:
             holder.txt.setText("Pouya 5");
             break;
         case 5:
             holder.txt.setText("Pouya 6");
             break;
         case 6:
             holder.txt.setText("Pouya 7");
             break;
         case 7:
             holder.txt.setText("Pouya 8");
             break;
         case 8:
             holder.txt.setText("Pouya 9");
             break;
         case 9:
             holder.txt.setText("Pouya 10");
             break;
         case 10:
             holder.txt.setText("Pouya 11");
             break;

    }*/
}

    @Override
    public int getItemCount() {

      return mylist.size();

        /*
        return 11;
*/
    }

class TestViewHolder extends RecyclerView.ViewHolder {
    TextView txt;

    public TestViewHolder(@NonNull View itemView) {
        super(itemView);

        txt = itemView.findViewById(R.id.txtname);
    }
}




}
