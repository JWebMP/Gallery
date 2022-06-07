$('.blueimpgallery_links').on('onslide', function (index, slide) {
    var text = this.list[index].getAttribute('data-description'),
        node = this.container.find('.description');
    node.empty();
    if (text) {
        node[0].appendChild(document.createTextNode(text));
    }
});
