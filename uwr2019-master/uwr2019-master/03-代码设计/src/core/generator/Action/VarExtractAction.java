package core.generator.Action;

import com.aspose.words.IReplacingCallback;

import core.common.DataHolder;
import core.common.DataSource;
import core.common.DataSourceType;
import core.loader.*;
import core.render.ImgRender;

/**
 * 统一Word报告生成系统（UWR）
 * 变量抽取类
 * @author 张学龙
 * @author 朴勇 15641190702
 * 
 */
abstract class VarExtractAction implements IReplacingCallback, DataSourceType {
	
	protected void register(DataHolder dh) {
		DataSource ds = dh.getDataSource();
		ds.getVars().add(dh);

		if (CONST.equalsIgnoreCase(ds.getType()))
			dh.setHolderFiller(ExprEvaluator.newInstance());
		else if (XML.equalsIgnoreCase(ds.getType()))
			dh.setHolderFiller(XmlLoader.newInstance());
		else if(IMG.equalsIgnoreCase(ds.getType())) {
            dh.setHolderFiller(ImgLoader.newInstance());
            dh.setHolderRender(new ImgRender());
		}
	}

}
