package service;

import entity.Tool;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ToolServiceImpl implements ToolService {

/*without null*/
    @Override
    public List<Tool> toolsList() {
        return null;
    }

    @Override
    public String descriptionTool(long id) {
        return null;
    }

    @Override
    public Tool buyTool(long userId) {
        return null;
    }

    @Override
    public void sellTool(long userId) {

    }

    @Override
    public void repairTool(long userId) {

    }
}
