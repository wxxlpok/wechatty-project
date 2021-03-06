package space.chensheng.wechatty.mp.material.upload;

import java.io.File;

import space.chensheng.wechatty.common.conf.AppContext;
import space.chensheng.wechatty.common.material.MediaType;

public class VoiceTemporaryMedia extends TemporaryMedia {

	/**
	 *
	 * @param media {@code size <= 2M}, {@code times <= 60s}, format: amr|mp3
	 */
	public VoiceTemporaryMedia(AppContext appContext, File media) {
		super(appContext, MediaType.VOICE, media);
	}

}
