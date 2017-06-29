package me.saket.dank.ui.submission;

/**
 * Represents one row in the comments section.
 */
public interface SubmissionCommentRow {

  enum Type {
    USER_COMMENT,
    REPLY,
    PENDING_SYNC_REPLY,
    LOAD_MORE_COMMENTS,
  }

  long id();

  Type type();
}