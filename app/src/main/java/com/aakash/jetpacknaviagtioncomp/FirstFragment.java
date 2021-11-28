package com.aakash.jetpacknaviagtioncomp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
/*

        Button button = view.findViewById(R.id.button_frag1);



//        First Way
*/
/*        View.OnClickListener s = Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment);
        button.setOnClickListener(s);*//*



//        Second Way
        final NavController navController = Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment);
        button.setOnClickListener(view1 ->
//                navController.navigate(R.id.action_firstFragment_to_secondFragment
                navController.navigate(R.id.action_firstFragment_to_secondFragment));

*/

        Button button = view.findViewById(R.id.button_frag1);

//        Bundle bundle = new Bundle();
//        bundle.putBoolean("test_boolean", false);

        final NavController navController = Navigation.findNavController(requireActivity(), R.id.my_nav_host_fragment);


//        Method 1
    /*    button.setOnClickListener(v -> {
            navController.navigate(R.id.action_firstFragment_to_secondFragment);
        });*/


//        Method 2
   /*     button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment, null));*/

//      Method 3
        button.setOnClickListener(v->{
            Navigation.findNavController(v).navigate(R.id.action_firstFragment_to_secondFragment);
        });
    }
}