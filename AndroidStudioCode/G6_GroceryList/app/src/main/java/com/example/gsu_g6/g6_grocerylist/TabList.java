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

public class TabList extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_list, container, false);
        String[] groupNames = {"list1", "list2", "list3", "list3"};
        ListView groups = (ListView) rootView.findViewById(R.id.listListView);
        ListAdapter groupAdapter = new ListListAdapter(this.getContext(), groupNames);
        groups.setAdapter(groupAdapter);
        return rootView;
    }
}
