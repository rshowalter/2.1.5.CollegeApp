package org.pltw.examples.collegeapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rshowalter on 11/29/2017.
 */


public class FamilyMemberFragment extends android.support.v4.app.Fragment {

    TextView mFirstName;
    TextView mLastName;

    EditText mEditFirstName;
    EditText mEditLastName;

    //2.1.5#11 creates a new variable of the class FamilyMember so that an object
    // can be created that has the fields mFirstName and mLastName
    private FamilyMember mFamilyMember;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);

        //2.1.5#11 creates the object of the FamilyMember class so that the First Name can be assigned to the text view item
        mFamilyMember = new FamilyMember();

        //2.1.5#11 wires the TextView item in the fragment_family_member.xml file to the instance vars mFirstName and mLastName
        mFirstName = (TextView) rootView.findViewById(R.id.familyMemberFirstNameTextView);
        mLastName = (TextView) rootView.findViewById(R.id.familyMemberLastNameTextView);

        //2.1.5#11 uses the field firstName from the mFamilyMember object to set the value of mFirstName and mLastName
        //...which is the TextView label in the fragment_family_member.xml
        mFirstName.setText(mFamilyMember.getFirstName());
        mLastName.setText(mFamilyMember.getLastName());

        return rootView;
    }


}
