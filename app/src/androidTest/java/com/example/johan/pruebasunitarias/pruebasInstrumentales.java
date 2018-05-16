package com.example.johan.pruebasunitarias;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class pruebasInstrumentales  {


    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);




    @Test
    public void testLogin() throws Exception {
       onView(withId(R.id.campoUsuario)).perform(typeText("admin"));
        onView(withId(R.id.campoContraseña)).perform(typeText("admin"));
        onView(withId(R.id.boton2))
                .perform(click());
       testSum();


    }



    @Ignore
    @Test
    public void testSum() throws Exception {
        onView(withId(R.id.calculator_input))
                .perform(typeText("2 + 2"));
        onView(withText("pulsame"))
                .perform(click());
        onView(withId(R.id.calculator_result))
                .check(matches(withText("4")));

    }

    /*
    @Rule
    public ActivityTestRule<Formulario> activityTestRule2 =
            new ActivityTestRule<>(Formulario.class);
            */

}
