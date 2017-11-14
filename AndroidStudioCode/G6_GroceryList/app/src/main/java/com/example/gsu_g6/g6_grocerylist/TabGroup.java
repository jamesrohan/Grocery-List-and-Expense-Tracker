package com.example.gsu_g6.g6_grocerylist;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Ejiroghene on 11/14/2017.
 */

public class TabGroup extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_group, container, false);
        String[] groupNames = {"school", "room1", "room2", "blalal"};
        ListView groups = (ListView) rootView.findViewById(R.id.groupListView);
        ListAdapter groupAdapter = new GroupListAdapter(this.getContext(), groupNames);
        groups.setAdapter(groupAdapter);
        return rootView;
    }
}
