/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_inter;

import entity.Digital;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface DigitalDAOInter {
     public Digital getTop1() throws Exception;
     
     public Digital getOne(int id) throws Exception;
     
     public List<Digital> getTop5() throws Exception;
     
     public List<Digital> search(String txt, int pageIndex, int pageSize) throws Exception;
     
     public int count(String txt) throws Exception;
}
