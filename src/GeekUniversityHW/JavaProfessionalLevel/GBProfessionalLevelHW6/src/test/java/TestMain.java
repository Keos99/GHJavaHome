package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW6.src.test.java;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class TestMain {

    @Test
    public void testGetSurnameByScore(){
        try {
            Main.connect();
            Assert.assertTrue(Main.getSurnameByScore(4));
            Main.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAdd(){
        try {
            Main.connect();
            Main.connection.setAutoCommit(false);
            Assert.assertEquals(1,Main.add("6","Пирожков","6"));
            Main.connection.rollback();
            Main.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeleteByScore(){
        try {
            Main.connect();
            Main.connection.setAutoCommit(false);
            Assert.assertEquals(1,Main.deleteByScore("3"));
            Main.connection.rollback();
            Main.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdateSurnameByScore(){
        try {
            Main.connect();
            Main.connection.setAutoCommit(false);
            Assert.assertEquals(1,Main.updateSurnameByScore("Волков","2"));
            Main.connection.rollback();
            Main.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
