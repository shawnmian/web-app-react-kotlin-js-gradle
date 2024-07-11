import kotlinx.browser.window
import react.*
import react.dom.*
import react.dom.html.ReactHTML.p

external interface VideoListProps : Props {
    var videos: List<Video>
}
val VideoList = FC<VideoListProps> {  props ->
    for (video in props.videos) {
        p {
            key = video.id.toString()
            onClick = {
                window.alert("Clicked $video!")
            }
            +"${video.speaker}: ${video.title}"
        }
    }
}