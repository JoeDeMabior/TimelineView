package com.joe.timelineview

import me.jerryhanks.timelineview.model.Status
import me.jerryhanks.timelineview.model.TimeLine

class MyTimeline(status: Status, var title: String?, var content: String?) : TimeLine(status) {

    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (javaClass != other?.javaClass)
            return false

        other as MyTimeline

        if (title != other.title)
            return false
        if (content != other.content)
            return false

        return true
    }

    override fun hashCode(): Int {
        var result = if (title != null) title!!.hashCode() else 0
        result = 31 * result + if (content != null) content!!.hashCode() else 0
        return result
    }

    override fun toString(): String {
        return "MyTimeline {" +
                "title = '" + title + '\'' +
                ", content = '" + content + '\'' +
                '}'
    }

}