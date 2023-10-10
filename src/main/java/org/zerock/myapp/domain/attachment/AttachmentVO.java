package org.zerock.myapp.domain.attachment;

import lombok.Value;
import org.zerock.myapp.domain.item.ItemVO;

import java.sql.Timestamp;

@Value
public class AttachmentVO {
    private Long attachementNo;
    private Long productNo;
    private String attachmentName;
    private String attachmentPath;
    private Timestamp attachmentDate;
}
