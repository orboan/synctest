/*
 * Jamendo.java   
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * 
 * Plays with Jamendo TOP50.
 * 
 */
public class Jamendo {
    private String pathTop50;

    public Jamendo(String pathTop50) {
        this.pathTop50 = pathTop50;
    }

    /**
     * Generates a TOP50 file with the following heading: ID NAME ALBUM_NAME ARTIST_NAME URL ALBUM_URL ALBUM_IMAGE
     * 
     * @param outputFilePath the output file path.
     */
    public void title(String outputFilePath) {
        Reader r = new Reader(pathTop50);
        Writer w = new Writer(outputFilePath);
        // Wirte the heading
        w.println("ID\tNAME\tALBUM_NAME\tARTIST_NAME\tURL\tALBUM_URL\tALBUM_IMAGE");
        // Copy the rest of the file
        String l = r.readLine();
        while (l != null) {
            w.println(l);
            l = r.readLine();
        }
        r.close();
        w.close();

    }

    /**
     * Generates a file with artists of TOP50 list, ordered by artist ascending. The file won't contain repeated
     * artists.
     * 
     * @param outputFilePath the output file path.
     */
    public void artistsTop50(String outputFilePath) {
        Reader r = new Reader(pathTop50);
        // Write all artists in a temporary file
        Writer w = new Writer(outputFilePath + ".tmp");
        String l = r.readLine();
        while (l != null) {
            String artistName = l.split("\t")[3];
            w.println(artistName);
            l = r.readLine();
        }
        r.close();
        w.close();
        // Creates another temporary file to order by artist name
        Files.createOrderedCsvFile(outputFilePath + ".tmp", outputFilePath + ".tmp2", 0, 3, "\t");
        // Delete the first temporary file
        Files.delete(outputFilePath + ".tmp");
        // Remove repeated artist names
        w = new Writer(outputFilePath);
        w.println("ARTIST_NAME");
        r = new Reader(outputFilePath + ".tmp2");
        l = r.readLine();
        String lAnt = "";
        while (l != null) {
            if (!l.equals(lAnt)) {
                w.println(l);
            }
            lAnt = l;
            l = r.readLine();
        }
        r.close();
        w.close();
        // Delete the second temporary file
        Files.delete(outputFilePath + ".tmp2");
    }

    /**
     * Generates a file with album and cover URLs.
     * 
     * @param outputFilePath the output file path.
     */
    public void linksAlbumsCovers(String outputFilePath) {
        Reader r = new Reader(pathTop50);
        Writer w = new Writer(outputFilePath);
        w.println("ALBUM_URL\tALBUM_IMAGE");
        String l = r.readLine();
        while (l != null) {
            String albumURL = l.split("\t")[5];
            String albumImage = l.split("\t")[6];
            w.println(albumURL + "\t" + albumImage);
            l = r.readLine();
        }
        r.close();
        w.close();
    }

    /**
     * Generate a file with TopN.
     * 
     * @param n an integer number, between 1 and 50.
     * @param outputFilePath the output file path.
     */
    public void topN(int n, String outputFilePath) {
        Reader r = new Reader(pathTop50);
        Writer w = new Writer(outputFilePath);
        w.println("ID\tNAME\tALBUM_NAME\tARTIST_NAME\tURL\tALBUM_URL\tALBUM_IMAGE");
        for (int i = 0; i < n; i++) {
            String l = r.readLine();
            w.println(l);
        }
        r.close();
        w.close();
    }

    /**
     * Generates a file with all tracks but only with specified fields.
     * 
     * @param id true if id must appear, false otherwise
     * @param name true if name must appear, false otherwise
     * @param albumName true if album name must appear, false otherwise
     * @param artistName true if artist name must appear, false otherwise
     * @param url true if url must appear, false otherwise
     * @param albumUrl true if album url must appear, false otherwise
     * @param albumImage true if album image must appear, false otherwise
     * @param outputFilePath the output file path.
     */
    public void top50Select(boolean id, boolean name, boolean albumName, boolean artistName, boolean url,
            boolean albumUrl, boolean albumImage, String outputFilePath) {
        Reader r = new Reader(pathTop50);
        Writer w = new Writer(outputFilePath);
        if (id)
            w.print("ID\t");
        if (name)
            w.print("NAME\t");
        if (albumName)
            w.print("ALBUM_NAME\t");
        if (artistName)
            w.print("ARTIST_NAME\t");
        if (url)
            w.print("URL\t");
        if (albumUrl)
            w.print("ALBUM_URL\t");
        if (albumImage)
            w.print("ALBUM_IMAGE");
        w.print("\n");
        String l = r.readLine();
        while (l != null) {
            if (id)
                w.print(l.split("\t")[0] + "\t");
            if (name)
                w.print(l.split("\t")[1] + "\t");
            if (albumName)
                w.print(l.split("\t")[2] + "\t");
            if (artistName)
                w.print(l.split("\t")[3] + "\t");
            if (url)
                w.print(l.split("\t")[4] + "\t");
            if (albumUrl)
                w.print(l.split("\t")[5] + "\t");
            if (albumImage)
                w.print(l.split("\t")[6] + "\t");
            w.print("\n");
            l = r.readLine();
        }
        r.close();
        w.close();
    }

    /**
     * Generates a file with all tracks ordered by an specified field.
     * 
     * @param field the field name.
     * @param outputFilePath the output file path.
     */
    public void top50Ordered(String field, String outputFilePath) {
        int nCamp = 0;
        if (field.equals("ID"))
            nCamp = 0;
        if (field.equals("NAME"))
            nCamp = 1;
        if (field.equals("ALBUM_NAME"))
            nCamp = 2;
        if (field.equals("ARTIST_NAME"))
            nCamp = 3;
        if (field.equals("URL"))
            nCamp = 4;
        if (field.equals("ALBUM_URL"))
            nCamp = 5;
        if (field.equals("ALBUM_IMAGE"))
            nCamp = 6;
        Files.createOrderedCsvFile(pathTop50, outputFilePath, nCamp, 3, "\t");
    }

    /**
     * Generates an HTML file with a list of links where the name of the track links to the URL of the track.
     * 
     * @param outputFilePath the output file path.
     */
    public void webLinks(String outputFilePath) {
        Reader r = new Reader(pathTop50);
        Writer w = new Writer(outputFilePath);
        w.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
        w.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        w.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
        w.println("<head>");
        w.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
        w.println("<title>TOP 50</title>");
        w.println("</head>");
        w.println("<body>");
        w.println("<h1>Top 50</h1>");
        w.println("<ul>");
        String l = r.readLine();
        while (l != null) {
            String name = l.split("\t")[1];
            String url = l.split("\t")[4];
            w.println("<li><a href=\"" + url + "\">" + name + "</a></li>");
            l = r.readLine();
        }
        r.close();
        w.println("</ul>");
        w.println("</body>");
        w.println("</html>");
        w.close();
    }

    /**
     * Generates an HTML file with cover images are links to the album URL.
     * 
     * @param outputFilePath the output file path.
     */
    public void webImages(String outputFilePath) {
        Reader r = new Reader(pathTop50);
        Writer w = new Writer(outputFilePath);
        w.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
        w.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        w.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
        w.println("<head>");
        w.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
        w.println("<title>TOP 50</title>");
        w.println("</head>");
        w.println("<body>");
        w.println("<h1>Top 50</h1>");
        w.println("<div>");
        String l = r.readLine();
        while (l != null) {
            String albumUrl = l.split("\t")[5];
            String albumImage = l.split("\t")[6];
            w.println("<a href=\"" + albumUrl + "\">");
            w.println("<img src=\"" + albumImage + "\" />");
            w.println("</a>");
            l = r.readLine();
        }
        r.close();
        w.println("</div>");
        w.println("</body>");
        w.println("</html>");
        w.close();
    }

    /**
     * Generates an HTML file with players of all tracks.
     * 
     * @param outputFilePath the output file path.
     */
    public void webPlayers(String outputFilePath) {
        Reader r = new Reader(pathTop50);
        Writer w = new Writer(outputFilePath);
        w.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
        w.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        w.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
        w.println("<head>");
        w.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
        w.println("<title>TOP 50</title>");
        w.println("</head>");
        w.println("<body>");
        w.println("<h1>Top 50</h1>");
        String l = r.readLine();
        while (l != null) {
            String index = l.split("\t")[0];
            w.println("<div style=\"float:left\">");
            w.println("<object width=\"200\" height=\"300\" classid=\"clsid:d27cdb6e-ae6d-11cf-96b8-444553540000\" codebase=\"http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,0,0\" align=\"middle\">");
            w.println("<param name=\"allowScriptAccess\" value=\"always\" />");
            w.println("<param name=\"wmode\" value=\"transparent\" />");
            w.println("<param name=\"movie\" value=\"http://widgets.jamendo.com/en/track/?playertype=2008&track_id="
                    + index + "\" />");
            w.println("<param name=\"quality\" value=\"high\" />");
            w.println("<param name=\"bgcolor\" value=\"#FFFFFF\" />");
            w.println("<embed src=\"http://widgets.jamendo.com/en/track/?playertype=2008&track_id="
                    + index
                    + "\" quality=\"high\" wmode=\"transparent\" bgcolor=\"#FFFFFF\" width=\"200\" height=\"300\" align=\"middle\" allowScriptAccess=\"always\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\">&nbsp;</embed>&nbsp;");
            w.println("</object>");
            w.println("<a href=\"http://pro.jamendo.com/\" style=\"display:block;font-size:8px !important;\">Free music for professional licensing</a>");
            w.println("</div>");
            l = r.readLine();
        }
        r.close();
        w.println("</body>");
        w.println("</html>");
        w.close();
    }
}
