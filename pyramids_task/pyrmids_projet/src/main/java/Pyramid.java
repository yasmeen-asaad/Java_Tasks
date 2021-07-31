/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasmeen
 */
public class Pyramid 
{
    String pharaeh, modern_name, site;
    double height;
    public Pyramid(String pharaeh, String modern_name, String site, double height) 
    {
        this.pharaeh = pharaeh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
    }

    public void setPharaeh(String pharaeh) 
    {
        this.pharaeh = pharaeh;
    }

    public void setModern_name(String modern_name) 
    {
        this.modern_name = modern_name;
    }

    public void setSite(String site) 
    {
        this.site = site;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public String getPharaeh() 
    {
        return pharaeh;
    }

    public String getMmodern_name() 
    {
        return modern_name;
    }

    public String getSite() 
    {
        return site;
    }

    public double getHeight() 
    {
        return height;
    }

    @Override
    public String toString() 
    {
        String info;
        info = "Pyramid Info :\nPharaeh name: " + this.pharaeh + "\nModer name: " + this.modern_name + "\nSite: " + this.site + "Height: " + this.height;
        return info;
    }
    
    
}
