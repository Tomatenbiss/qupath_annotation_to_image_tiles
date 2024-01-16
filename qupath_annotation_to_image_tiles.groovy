int patch_size = 224
def image_extension = ".png"
def image_data = getCurrentImageData()

def out_path = "C:\\Users\\bissont\\Downloads"

tile_exporter = new TileExporter(image_data)
tile_exporter.imageExtension(image_extension)
tile_exporter.tileSize(patch_size)
tile_exporter.annotatedTilesOnly(true)
tile_exporter.writeTiles(out_path)