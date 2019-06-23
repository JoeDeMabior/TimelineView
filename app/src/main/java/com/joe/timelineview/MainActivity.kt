package com.joe.timelineview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.jerryhanks.timelineview.IndicatorAdapter
import me.jerryhanks.timelineview.model.Status

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: IndicatorAdapter<MyTimeline>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timelines = mutableListOf<MyTimeline>().apply {
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_1), getString(R.string.s_content_1)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_2), getString(R.string.s_content_2)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_3), getString(R.string.s_content_3)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_4), getString(R.string.s_content_4)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_5), getString(R.string.s_content_5)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_6), getString(R.string.s_content_6)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_7), getString(R.string.s_content_7)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_8), getString(R.string.s_content_8)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_9), getString(R.string.s_content_9)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_10), getString(R.string.s_content_10)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_11), getString(R.string.s_content_11)))
            add(MyTimeline(Status.COMPLETED, getString(R.string.s_title_12), getString(R.string.s_content_12)))
        }
    }
}
