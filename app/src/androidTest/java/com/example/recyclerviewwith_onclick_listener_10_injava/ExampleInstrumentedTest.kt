package com.example.recyclerviewwith_onclick_listener_10_injava

import com.example.recyclerviewwith_onclick_listener_10_injava.activity.MainActivity
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recyclerviewwith_onclick_listener_10_injava.R
import com.example.recyclerviewwith_onclick_listener_10_injava.adapter.CustomAdapter.CustomViewHolder
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewwith_onclick_listener_10_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals(
            "com.example.recyclerviewwith_onclick_listener_10_injava",
            appContext.packageName
        )
    }
}