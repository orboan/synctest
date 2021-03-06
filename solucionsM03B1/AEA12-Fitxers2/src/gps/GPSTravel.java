/*
 * GPSTravel.java   
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

import org.joda.time.DateTime;

/**
 * Methods related to gps tracks and correlated photos.
 * 
 */
public class GPSTravel {
    private String pathTrack;
    private String pathPhotos;

    // Constructor

    public GPSTravel(String pathTrack, String pathPhotos) {
        this.pathTrack = pathTrack;
        this.pathPhotos = pathPhotos;
    }

    /**
     * Calculates how many points have been recorded.
     * 
     * @return the number of recorded points.
     */
    public int countPoints() {
        Reader r = new Reader(pathTrack);
        r.readLine();
        int i = 0;
        String l = r.readLine();
        while (l != null) {
            i++;
            l = r.readLine();
        }
        r.close();
        return i;
    }

    /**
     * Calculates the distance between two points. Points must be valid.
     * 
     * @param point1 the first point
     * @param point2 the second point
     * @return the distance
     */
    public double distanceBetweenPoints(int point1, int point2) {
        Reader r = new Reader(pathTrack);
        String l = r.readLine();
        // Go to the first point
        for (int i = 1; i <= point1; i++) {
            l = r.readLine();
        }
        // Get the first distance
        double iniDist = Double.parseDouble(l.split(",")[11]);
        // Go to the second point
        for (int j = point1 + 1; j <= point2; j++) {
            l = r.readLine();
        }
        // Get the second distance
        double finDist = Double.parseDouble(l.split(",")[11]);
        r.close();
        return finDist - iniDist;
    }

    /**
     * Calculates the total distance of the track.
     * 
     * @return the distance
     */
    public double distanceTrack() {
        return distanceBetweenPoints(1, countPoints());
    }

    /**
     * Calculates how much time has passed between two points. Points must be valid.
     * 
     * @param point1 the first point
     * @param point2 the second point
     * @return time in seconds
     */
    public long timeBetweenPoints(int point1, int point2) {
        Reader r = new Reader(pathTrack);
        String l = r.readLine();
        // Go to the first point
        for (int i = 1; i <= point1; i++) {
            l = r.readLine();
        }
        // Get initial date time
        String iniDate = l.split(",")[2];
        String iniHour = l.split(",")[3];
        // Go to the second point
        for (int j = point1 + 1; j <= point2; j++) {
            l = r.readLine();
        }
        // Get final date time
        String finDate = l.split(",")[2];
        String finHour = l.split(",")[3];
        // Convert initial date time to DateTime
        String iniTime = iniDate.substring(8) + "/" + iniDate.substring(5, 7) + "/" + iniDate.substring(0, 4) + "-"
                + iniHour;
        DateTime iniDT = JodaDT.parseDDMMYYYYhhmmss(iniTime);
        // Convert final date time to DateTime
        String finTime = finDate.substring(8) + "/" + finDate.substring(5, 7) + "/" + finDate.substring(0, 4) + "-"
                + finHour;
        DateTime finDT = JodaDT.parseDDMMYYYYhhmmss(finTime);
        r.close();
        return JodaDT.durationInSeconds(iniDT, finDT);
    }

    /**
     * Calculates how long the track is.
     * 
     * @return time in seconds.
     */
    public long timeTrack() {
        return timeBetweenPoints(1, countPoints());
    }

    /**
     * Calculates the accumulated height gain between two points. Points must be valid.
     * 
     * @param point1 the first point
     * @param point2 the second point
     * @return the accumulated height gain
     */
    public double ascentGradientBetweenPoints(int point1, int point2) {
        Reader r = new Reader(pathTrack);
        String l = r.readLine();
        // Go to the first point
        for (int i = 1; i <= point1; i++) {
            l = r.readLine();
        }
        // Get the altitude of the first point
        double altitude1 = Double.parseDouble(l.split(",")[9]);
        double ag = 0;
        // Accumulate the height gain until the second point
        for (int j = point1 + 1; j <= point2; j++) {
            l = r.readLine();
            double altitude2 = Double.parseDouble(l.split(",")[9]);
            double diff = altitude2 - altitude1;
            // Accumulate only if we are climbing
            if (diff > 0) {
                ag += diff;
            }
            // Remember the current altitude
            altitude1 = altitude2;
        }
        r.close();
        return ag;
    }

    /**
     * Calculates the total accumulated height gain of the track.
     * 
     * @return the accumulated height gain
     */
    public double accumulatedAscentGradient() {
        return ascentGradientBetweenPoints(1, countPoints());
    }

    /**
     * Calculates the accumulated height loss between two points. Points must be valid.
     * 
     * @param point1 the first point
     * @param point2 the second point
     * @return the accumulated height loss
     */
    public double descentGradientBetweenPoints(int point1, int point2) {
        Reader r = new Reader(pathTrack);
        String l = r.readLine();
        // Go to the first point
        for (int i = 1; i <= point1; i++) {
            l = r.readLine();
        }
        // Get the altitude of the first point
        double height1 = Double.parseDouble(l.split(",")[9]);
        double dg = 0;
        // Accumulate height loss until the second point
        for (int j = point1 + 1; j <= point2; j++) {
            l = r.readLine();
            double height2 = Double.parseDouble(l.split(",")[9]);
            double dif = height1 - height2;
            if (dif > 0) {
                dg += dif;
            }
            height1 = height2;
        }
        r.close();
        return dg;
    }

    /**
     * Calculates the total accumulated height loss of the track.
     * 
     * @return the accumulated height loss
     */
    public double accumulatedDescentGradient() {
        return descentGradientBetweenPoints(1, countPoints());
    }

    /**
     * Calculates where the person who walked the track was in a concrete percentage of walked distance.
     * 
     * @param percent the percentage
     * @return latitude and longitude with format "INDEX: LatNS LonEW"
     */
    public String whereWasI(double percent) {
        // Get the total distance
        double distance = distanceTrack();
        // Calculate the partial distance
        double partialDistance = distance * percent / 100;
        String index = "", lat = "", ns = "", lon = "", ew = "";
        double dist = 0;
        Reader r = new Reader(pathTrack);
        String l = r.readLine();
        l = r.readLine();
        // Go until the partial distance and get coordinates
        while (l != null && dist < partialDistance) {
            index = l.split(",")[0];
            lat = l.split(",")[5];
            ns = l.split(",")[6];
            lon = l.split(",")[7];
            ew = l.split(",")[8];
            dist = Double.parseDouble(l.split(",")[11]);
            l = r.readLine();
        }
        r.close();
        return index + ": " + lat + ns + " " + lon + ew;
    }

    /**
     * Generates a file with OSM URLs for each point of the track.
     * 
     * @param outputFilePath the output file path.
     */
    public void positionsOSM(String outputFilePath) {
        Writer w = new Writer(outputFilePath);
        Reader r = new Reader(pathTrack);
        String l = r.readLine();
        double lat = 0, lon = 0;
        String ns = "", ew = "";
        l = r.readLine();
        while (l != null) {
            lat = Double.parseDouble(l.split(",")[5]);
            ns = l.split(",")[6];
            lon = Double.parseDouble(l.split(",")[7]);
            ew = l.split(",")[8];
            if (ns.equals("S"))
                lat = -lat;
            if (ew.equals("W"))
                lon = -lon;
            // Build the URL
            w.println("http://www.openstreetmap.org/?mlat=" + lat + "&mlon=" + lon + "&zoom=18");
            l = r.readLine();
        }
        r.close();
        w.close();
    }

    /**
     * Geolocates a photo.
     * 
     * @param photoName the photo's name.
     * @param hourDeviation UTC hour deviation.
     * @return a string with information about the photo with format:
     *         IMGNAME,INDEX,DATE,TIME,LATITUDE,N/S,LONGITUDE,E/W,HEIGHT
     */
    public String geoLocatePhoto(String photoName, int hourDeviation) {
        Reader rf = new Reader(pathPhotos);
        String l = rf.readLine();
        l = rf.readLine();
        String name = "";
        String dateHour = "";
        // Go to the desired photo
        while (l != null && !name.equals(photoName)) {
            name = l.split(",")[0];
            dateHour = l.split(",")[1];
            l = rf.readLine();
        }
        // Convert photo date time into a DateTime object
        DateTime dtPhoto = JodaDT.parseDDMMYYYYhhmmss(dateHour);
        // Add hour deviation
        dtPhoto = dtPhoto.minusHours(hourDeviation);
        rf.close();
        Reader rr = new Reader(pathTrack);
        l = rr.readLine();
        boolean pastHour = false;
        String index = "", lat = "", ns = "", lon = "", ew = "", dTrack = "", hTrack = "", height = "";
        l = rr.readLine();
        // Read lines until we pass the datetime of the photo
        while (l != null && !pastHour) {
            index = l.split(",")[0];
            lat = l.split(",")[5];
            ns = l.split(",")[6];
            lon = l.split(",")[7];
            ew = l.split(",")[8];
            height = l.split(",")[9];
            dTrack = l.split(",")[2];
            hTrack = l.split(",")[3];
            String dateHourTrack = dTrack.substring(8) + "/" + dTrack.substring(5, 7) + "/" + dTrack.substring(0, 4)
                    + "-" + hTrack;
            // Convert point date time into a DateTime object
            DateTime dtPoint = JodaDT.parseDDMMYYYYhhmmss(dateHourTrack);
            if (dtPoint.isAfter(dtPhoto)) {
                pastHour = true;
            }
            l = rr.readLine();
        }
        rr.close();
        return photoName + "," + index + "," + dTrack + "," + hTrack + "," + lat + "," + ns + "," + lon + "," + ew
                + "," + height;
    }

    /**
     * Generates a file with geolocated photos. Each line of the file will have the following format:
     * IMGNAME,INDEX,DATE,TIME,LATITUDE,N/S,LONGITUDE,E/W,HEIGHT
     * 
     * @param outputFilePath the output file path.
     * @param hourDeviation UTC hour deviation.
     */
    public void geoLocateAllPhotos(String outputFilePath, int hourDeviation) {
        Writer wf = new Writer(outputFilePath);
        Reader rf = new Reader(pathPhotos);
        String l = rf.readLine();
        l = rf.readLine();
        while (l != null) {
            String name = l.split(",")[0];
            // For each photo, write its information
            String infoPhoto = geoLocatePhoto(name, hourDeviation);
            wf.println(infoPhoto);
            l = rf.readLine();
        }
        rf.close();
        wf.close();
    }

    /**
     * Generates a file with OSM URLs for each geolocated photo. Each line will have the following format: NOMIMG,URL
     * 
     * @param outputFilePath the output file path.
     * @param hourDeviation UTC hour deviation.
     */
    public void geoLocateAllPhotosOSM(String outputFilePath, int hourDeviation) {
        Writer wf = new Writer(outputFilePath);
        Reader rf = new Reader(pathPhotos);
        String l = rf.readLine();
        l = rf.readLine();
        while (l != null) {
            String name = l.split(",")[0];
            // For each photo, get its geolocation
            String infoPhoto = geoLocatePhoto(name, hourDeviation);
            double lat = Double.parseDouble(infoPhoto.split(",")[4]);
            String ns = infoPhoto.split(",")[5];
            double lon = Double.parseDouble(infoPhoto.split(",")[6]);
            String ew = infoPhoto.split(",")[7];
            if (ns.equals("S"))
                lat = -lat;
            if (ew.equals("W"))
                lon = -lon;
            // For each photo, write its corresponding URL
            wf.println(name + ",http://www.openstreetmap.org/?mlat=" + lat + "&mlon=" + lon + "&zoom=18");
            l = rf.readLine();
        }
        rf.close();
        wf.close();
    }

    /**
     * Gets the command that we should run to be able to geolocate it.
     * 
     * @param photoName the photo name.
     * @param hourDeviation UTC hour deviation.
     * @return the command.
     */
    public String geoTagCommand(String photoName, int hourDeviation) {
        // Geolocate the photo
        String infoPhoto = geoLocatePhoto(photoName, hourDeviation);
        double lat = Double.parseDouble(infoPhoto.split(",")[4]);
        String ns = infoPhoto.split(",")[5];
        double lon = Double.parseDouble(infoPhoto.split(",")[6]);
        String ew = infoPhoto.split(",")[7];
        String altitude = infoPhoto.split(",")[8];
        // Build the command using exiftool
        return "exiftool -GPSLatitude=\"" + lat + "\" -GPSLatitudeRef=\"" + ns + "\" -GPSLongitude=\"" + lon
                + "\" -GPSLongitudeRef=\"" + ew + "\" -GPSAltitude=\"" + altitude + "\" " + photoName;
    }

    /**
     * Generates a script that will geolocate all photos.
     * 
     * @param outputFilePath the output file path.
     * @param hourDeviation UTC hour deviation.
     */
    public void geoTagScript(String outputFilePath, int hourDeviation) {
        Reader rf = new Reader(pathPhotos);
        Writer ws = new Writer(outputFilePath);
        ws.println("#!/bin/bash");
        String l = rf.readLine();
        l = rf.readLine();
        while (l != null) {
            String photoName = l.split(",")[0];
            // For each photo, get its corresponding command
            String command = geoTagCommand(photoName, hourDeviation);
            ws.println(command);
            l = rf.readLine();
        }
        rf.close();
        ws.close();
    }
}
