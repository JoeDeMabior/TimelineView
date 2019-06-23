package com.joe.timelineview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import me.jerryhanks.timelineview.IndicatorAdapter
import me.jerryhanks.timelineview.interfaces.TimeLineViewCallback
import me.jerryhanks.timelineview.model.Status

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: IndicatorAdapter<MyTimeline>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeLines = mutableListOf<MyTimeline>().apply {
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

        adapter = IndicatorAdapter(mutableListOf(), this, object : TimeLineViewCallback<MyTimeline> {
            override fun onBindView(model: MyTimeline, container: FrameLayout, position: Int): View {
                val view = layoutInflater.inflate(R.layout.sample_time_line, container, false)
                view.findViewById<TextView>(R.id.tv_title).text = model.title
                view.findViewById<TextView>(R.id.tv_content).text = model.content
                return view
            }
        })

        timeline_view.setIndicatorAdapter(adapter)
        adapter.swapItems(timeLines)

        caption.text = getString(R.string.delivery_status)

        btn_add_to_top.setOnClickListener { addToTop() }
        btn_add_to_bottom.setOnClickListener { addToBottom() }
    }

    private fun addToTop() {
        val timeline = MyTimeline(Status.ATTENTION, "New Top One", "Hehehehe")
        adapter.addItems(timeline, index = 2)
        timeline_view.scrollToTop()
    }

    private fun addToBottom() {
        val timeline = MyTimeline(Status.ATTENTION, "New Bottom One", "Hahahahaha")
        adapter.addItems(timeline)
        timeline_view.scrollToBottom()
    }

}
