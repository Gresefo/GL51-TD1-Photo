package gl51-TD1.service

/**
 * Resizes the size of a picture
 */
interface RedimensionnementService{

    /**
     * Resizes the picture
     */
    Photo resize(Photo sourcePhoto)
    Photo getAndResizeImage()
}