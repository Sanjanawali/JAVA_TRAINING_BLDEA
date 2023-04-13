package com.bldea.crorepathiApp.package1;

import java.util.Scanner;

public class Questions {
	static String result;
	static String result2;
	static int count_life_line=3;
	static int aud_phone=1;
	static int skip_cnt=1;
	static int cnt_50_50=1;
	static Scanner sc = new Scanner(System.in);
	public static boolean fetchQuestion1(String name) throws Exception {
		System.out.println("1.Who is founder of java?");
		System.out.println("a.Dennis Ritchie\n"+
                "b.Charles Babbage\n"+
                "c.Rahul Gandhi\n"+
                "d.James Gosling\n"+
                "e.life line");
		result=sc.next();
		if(result.equalsIgnoreCase("d")) {
			Candidate.setAmount(1000);
			return true;
		}
		else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phone != 0) {
						aud_phone = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							Candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					Candidate.setAmount(1000);
					return true;
				}
			}

		}


				return false;
	}
	public static boolean fetchQuestion2(String name) throws Exception {
		System.out.println("2.Who is CEO of facebook?");
		System.out.println("a.Elon Musk\n"+
		                   "b.Sundar Pichai\n"+
		                   "c.Mark Zukerberg\n"+
		                   "d.James Gosling\n"+
		                   "e.life line");
		result=sc.next();
		if(result.equalsIgnoreCase("c")) {
			Candidate.setAmount(5000);
			return true;
		}
		else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phone != 0) {
						aud_phone = 0;
						Thread.sleep(1000);
						System.out.println("option a = 5%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 10%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Elon Musk\n"+
						                           "c.Mark Zukerberg\n");
								
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(5000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Elon Musk\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Mark Zukerberg\n"+
								                   "d.James Gosling");
								                   
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
								                   "b.Sundar Pichai\n"+
								                   "c.Mark Zukerberg"
								                   );
								
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a.Elon Musk\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Mark Zukerberg\n"+
								                   "d.James Gosling"
								                   );
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println(
				                   "b.Sundar Pichai\n"+
				                   "c.Mark Zukerberg");
				                  
				
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(5000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(10000);
								System.out.println("option a = 5%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 10%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Elon Musk\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Mark Zukerberg\n"+
								                   "d.James Gosling"
								                   );
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(10000);
										System.out.println("option a = 5%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 10%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a.Elon Musk\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Mark Zukerberg\n"+
								                   "d.James Gosling"
								                  );
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(5000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 5%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 10%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										
										System.out.println(
								                   "b.Sundar Pichai\n"+
								                   "c.Mark Zukerberg"
								                   );
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Elon Musk\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Mark Zukerberg\n"+
								                   "d.James Gosling"
								                   );
								
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
						                   "b.Sundar Pichai\n"+
						                   "c.Mark Zukerberg"
						                  );
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									Candidate.setAmount(5000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(10000);
										System.out.println("option a = 5%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 10%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a.Elon Musk\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Mark Zukerberg\n"+
								                   "d.James Gosling"
								                   );
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(5000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a.Elon Musk\n"+
		                   "b.Sundar Pichai\n"+
		                   "c.Mark Zukerberg\n"+
		                   "d.James Gosling"
		                   );
		
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(5000);
					return true;
				}
			}

		}
	

			return false;
	}

	public static boolean fetchQuestion3(String name) throws Exception {
		
		System.out.println("3.Who is Prime Minister of India?");
		System.out.println("a.M.K.Gandhi\n"+
		"b.Narendra Modi\n"+"c.ManmohanSingh\n"+"d.Indira Gandhi\n"+"e.Life-line");
		result=sc.next();
		if(result.equalsIgnoreCase("b")) {
			Candidate.setAmount(10000);
			return true;
		}
		else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phone != 0) {
						aud_phone = 0;
						Thread.sleep(1000);
						System.out.println("option a = 1%\n" + "option b = 90%\n" + "option c = 8%\n" + "option d = 1%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.M.K.Gandhi\n"+
										"b.Narendra Modi");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.M.K.Gandhi\n"+
												"b.Narendra Modi\n"+"c.ManmohanSingh\n"+"d.Indira Gandhi");
											result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.M.K.Gandhi\n"+
												"b.Narendra Modi");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.M.K.Gandhi\n"+
												"b.Narendra Modi\n"+"c.ManmohanSingh\n"+"d.Indira Gandhi");
											
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a.M.K.Gandhi\n"+
								"b.Narendra Modi");
							result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 1%\n" + "option b = 90%\n" + "option c = 8%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.M.K.Gandhi\n"+
												"b.Narendra Modi\n"+"c.ManmohanSingh\n"+"d.Indira Gandhi");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(10000);
										System.out.println("option a = 1%\n" + "option b = 90%\n" + "option c = 8%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a.M.K.Gandhi\n"+
												"b.Narendra Modi\n"+"c.ManmohanSingh\n"+"d.Indira Gandhi");
											result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(10000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 1%\n" + "option b = 90%\n" + "option c = 8%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.M.K.Gandhi\n"+
												"b.Narendra Modi");
											
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a.M.K.Gandhi\n"+
												"b.Narendra Modi\n"+"c.ManmohanSingh\n"+"d.Indira Gandhi");
											result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.M.K.Gandhi\n"+
										"b.Narendra Modi");
									
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 1%\n" + "option b = 90%\n" + "option c = 8%\n" + "option d = 1%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a.M.K.Gandhi\n"+
												       "b.Narendra Modi\n"+
											           "c.ManmohanSingh\n"+
												       "d.Indira Gandhi");
									
									
									  result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a.M.K.Gandhi\n"+
						"b.Narendra Modi\n"+"c.ManmohanSingh\n"+"d.Indira Gandhi");
					
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(10000);
					return true;
				}
			}

		}
		return false;


	}
	public static boolean fetchQuestion4(String name) throws Exception{
		System.out.println("4.Who invented the law of gravity?");
		System.out.println("a.Galileo\n"+
		                   "b.Sundar Pichai\n"+
		                   "c.Isaac Newton\n"+
		                   "d.Ramanujan\n"+
		                   "e.Life line");
		result=sc.next();
		if(result.equalsIgnoreCase("c")) {
			Candidate.setAmount(20000);
			return true;
		}
		else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phone != 0) {
						aud_phone = 0;
						Thread.sleep(1000);
						System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 5%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Galileo\n"+"c.Isaac Newton");
				                 result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Galileo\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Isaac Newton\n"+
								                   "d.Ramanujan"
								                   );
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.Galileo\n"+
								                   
								                   "c.Isaac Newton"
								                  );
								
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Galileo\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Isaac Newton\n"+
								                   "d.Ramanujan"
								                   );
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a.Galileo\n"+"c.Isaac Newton");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(10000);
								System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Galileo\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Isaac Newton\n"+
								                   "d.Ramanujan");
								                  
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Galileo\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Isaac Newton\n"+
								                   "d.Ramanujan");
								                   
								result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(20000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.Galileo\n"+"c.Isaac Newton");
								        result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Galileo\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Isaac Newton\n"+
								                   "d.Ramanujan");
								          result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Galileo\n"+
						                   "b.Sundar Pichai\n"+
						                   "c.Isaac Newton\n"+
						                   "d.Ramanujan");
						        result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 80%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a.Galileo\n"+
								                   "b.Sundar Pichai\n"+
								                   "c.Isaac Newton\n"+
								                   "d.Ramanujan");
								         result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				
				System.out.println("a.Galileo\n"+
		                   "b.Sundar Pichai\n"+
		                   "c.Isaac Newton\n"+
		                   "d.Ramanujan");
		        result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					Candidate.setAmount(20000);
					return true;
				}
			}
		}
        return false;
	}
		public static boolean fetchQuestion5(String name) throws Exception{
		System.out.println("5.When was the first passenger train ran in India ?");
		System.out.println("a.1853\n"+
		                   "b.1992\n"+
		                   "c.1982\n"+
		                   "d.1953\n"+
		                   "e.life line");
		result=sc.next();
		if(result.equalsIgnoreCase("a")) {
			Candidate.setAmount(50000);
			return true;
		}
		else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phone != 0) {
						aud_phone = 0;
						Thread.sleep(1000);
						System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 10%\n" + "option d = 5%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.1853\n"+
						                   "b.1992");
						        result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										Candidate.setAmount(50000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.1853\n"+
								                   "b.1992\n"+
								                   "c.1982\n"+
								                   "d.1953");
								         result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(50000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.1853\n"+
								                   "b.1992");
								        result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.1853\n"+
								                   "b.1992\n"+
								                   "c.1982\n"+
								                   "d.1953");
								         result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a.1853\n"+
				                   "b.1992\n"+
				                   "c.1982\n"+
				                   "d.1953");
				        result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 10%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a.1853\n"+
								                   "b.1992\n"+
								                   "c.1982\n"+
								                   "d.1953");
								         result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(50000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 5%\n" + "option d = 10%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.1853\n"+
								                   "b.1992\n"+
								                   "c.1982\n"+
								                   "d.1953");
								         result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						Candidate.setAmount(50000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 10%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.1853\n"+
								                   "b.1992");
									result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.1853\n"+
								                   "b.1992\n"+
								                   "c.1982\n"+
								                   "d.1953");
								         result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.1853\n"+
						                   "b.1992");
						                   result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 10%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.1853\n"+
								                   "b.1992\n"+
								                   "c.1982\n"+
								                   "d.1953");
								        result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a.1853\n"+
		                   "b.1992\n"+
		                   "c.1982\n"+
		                   "d.1953");
		        result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					Candidate.setAmount(50000);
					return true;
				}
			}

		}
		return false;
			}
		public static boolean fetchQuestion6(String name) throws Exception {
			System.out.println("6.Brain of computer is");
			System.out.println("a.Monitor\n"+
			                   "b.CPU\n"+
			                   "c.Mouse\n"+
			                   "d.Keyboard\n"+
			                   "e.Life line");
			result=sc.next();
			if(result.equalsIgnoreCase("b")) {
				Candidate.setAmount(100000);
				return true;
			}
			else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phone != 0) {
							aud_phone = 0;
							Thread.sleep(1000);
							System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 20%\n" + "option d = 20%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a.Monitor\n"+
							                   "b.CPU");
							         result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(100000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a.Monitor\n"+
									                   "b.CPU\n"+
									                   "c.Mouse\n"+
									                   "d.Keyboard");
									        result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(100000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a.Monitor\n"+
									                   "b.CPU");
									      	result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a.Monitor\n"+
									                   "b.CPU\n"+
									                   "c.Mouse\n"+
									                   "d.Keyboard");
									         result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a.Monitor\n"+
					                   "b.CPU");
					         result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phone != 0) {
									aud_phone = 0;
									Thread.sleep(1000);
									System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 20%\n" + "option d = 20%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a.Monitor\n"+
									                   "b.CPU\n"+
									                   "c.Mouse\n"+
									                   "d.Keyboard");
									                  
										result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(100000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("b")) {
										if (aud_phone != 0) {
											aud_phone = 0;
											Thread.sleep(1000);
											System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 20%\n" + "option d = 20%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
										    System.out.println("a.Monitor\n"+
									                   "b.CPU\n"+
									                   "c.Mouse\n"+
									                   "d.Keyboard\n"+
									                   "e.Life line");
									result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(100000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phone != 0) {
									aud_phone = 0;
									Thread.sleep(1000);
									System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 20%\n" + "option d = 20%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a.Monitor\n"+
									                   "b.CPU");
									       	result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											
											System.out.println("a.Monitor\n"+
									                   "b.CPU\n"+
									                   "c.Mouse\n"+
									                   "d.Keyboard");
									                   
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a.Monitor\n"+
							                   "b.CPU");
							      	result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result4.equalsIgnoreCase("b")) {
										if (aud_phone != 0) {
											aud_phone = 0;
											Thread.sleep(1000);
											System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 10%\n" + "option d = 10%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											
											System.out.println("a.Monitor\n"+
									                   "b.CPU\n"+
									                   "c.Mouse\n"+
									                   "d.Keyboard");
										result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a.Monitor\n"+
			                   "b.CPU\n"+
			                   "c.Mouse\n"+
			                   "d.Keyboard");
		            result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(100000);
						return true;
					}
				}
			}
				return false;
			}
		public static boolean fetchQuestion7(String name) throws Exception {
				System.out.println("7.Result of (2*(9/3)*4)");
				System.out.println("a.25\n"+
				                   "b.24\n"+
				                   "c.36\n"+
				                   "d.28\n"+
				                   "e.Life line");
				result=sc.next();
				if(result.equalsIgnoreCase("b")) {
					Candidate.setAmount(1000000);
					return true;
				}
				else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 10%\n" + "option d = 20%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1000000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.25\n"+
								                   "b.24");
								        result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(1000000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.25\n"+
										                   "b.24\n"+
										                   "c.36\n"+
										                   "d.28");
										         result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(1000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a.25\n"+
										                   "b.24");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.25\n"+
										                   "b.24\n"+
										                   "c.36\n"+
										                   "d.28");
										        result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.25\n"+
						                   "b.24");
						                
						        result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(1000000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 10%\n" + "option d =30%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
											   System.out.println("a.25\n"+
										                   "b.24\n"+
										                   "c.36\n"+
										                   "d.28\n"+
										                   "e.Life line");
											   result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(1000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (aud_phone != 0) {
												aud_phone = 0;
												Thread.sleep(1000);
												System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 10%\n" + "option d = 10%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.25\n"+
										                   "b.24\n"+
										                   "c.36\n"+
										                   "d.28\n"+
										                   "e.Life line");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(1000000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 10%\n" + "option d = 10%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a.25\n"+
										                   "b.24");
										        result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.25\n"+
										                   "b.24\n"+
										                   "c.36\n"+
										                   "d.28\n"+
										                   "e.Life line");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.25\n"+
								                   "b.24");
								      result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											Candidate.setAmount(1000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (aud_phone != 0) {
												aud_phone = 0;
												Thread.sleep(1000);
												System.out.println("option a = 10%\n" + "option b = 50%\n" + "option c = 10%\n" + "option d = 10%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.25\n"+
										                   "b.24\n"+
										                   "c.36\n"+
										                   "d.28");
										                  result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(1000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println("a.25\n"+
				                   "b.24\n"+
				                   "c.36\n"+
				                   "d.28");
				                  result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							Candidate.setAmount(1000000);
							return true;
						}
					}

				}
return false;
			}
				
			public static boolean fetchQuestion8(String name) throws Exception{
				System.out.println("8.Who is father of our nation?");
				System.out.println("a.M.K.Gandhi\n"+
				                   "b.Lal Bahaudur Singh \n"+
				                   "c.B.R.Ambedkar\n"+
				                   "d.Sangolli Rayanna\n"+
				                   "e.Life line");
				result=sc.next();
				if(result.equalsIgnoreCase("a")) {
					Candidate.setAmount(5000000);
					return true;
				}
				else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 4%\n" + "option d = 1%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.M.K.Gandhi\n"+
								                   "b.Lal Bahaudur Singh");
								             result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(5000000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.M.K.Gandhi\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										                  	result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(5000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a.M.K.Gandhi\n"+
										                   "b.Lal Bahaudur Singh");
										       result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.M.K.Gandhi\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										              result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.M.K.Gandhi\n"+
						                   "b.Lal Bahaudur Singh");
						               result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(5000000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 1%\n" + "option d = 4%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.M.K.Gandhi\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										            result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(5000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (aud_phone != 0) {
												aud_phone = 0;
												Thread.sleep(10000);
												System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 1%\n" + "option d = 4%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												
												System.out.println("a.M.K.Gandhi\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										                   result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(5000000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 1%\n" + "option d = 4%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a.M.K.Gandhi\n"+
										                   "b.Lal Bahaudur Singh");
										                  result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												
												System.out.println("a.M.K.Gandhi\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										                   	result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.M.K.Gandhi\n"+
								                   "b.Lal Bahaudur Singh");
								                  result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(5000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (aud_phone != 0) {
												aud_phone = 0;
												Thread.sleep(1000);
												System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 1%\n" + "option d = 4%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.M.K.Gandhi\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										                   	result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(5000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println("a.M.K.Gandhi\n"+
				                   "b.Lal Bahaudur Singh \n"+
				                   "c.B.R.Ambedkar\n"+
				                   "d.Sangolli Rayanna");
				                  	result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(5000000);
							return true;
						}
					}

				}
return false;
			}
			public static boolean fetchQuestion9(String name) throws Exception {
				System.out.println("9.Who invented Computer?");
				System.out.println("a.Charles Babbage\n"+
				                   "b.Lal Bahaudur Singh \n"+
				                   "c.B.R.Ambedkar\n"+
				                   "d.Sangolli Rayanna\n"+
				                   "e.Life-line");
				result=sc.next();
				if(result.equalsIgnoreCase("a")) {
					Candidate.setAmount(7000000);
					return true;
				}
				else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 77%\n" + "option b = 3%\n" + "option c = 15%\n" + "option d = 15%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									Candidate.setAmount(7000000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.Charles Babbage\n"+
								                   "b.Lal Bahaudur Singh");
								                  	result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(7000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(7000000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												
												System.out.println("a.Charles Babbage\n"+
										                   "b.Lal Bahaudur Singh");
										                   result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(7000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a.Charles Babbage\n"+
										                   "b.Lal Bahaudur Singh");
										                  	result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(7000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Charles Babbage\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");									                 
									result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Charles Babbage\n"+
						                   "b.Lal Bahaudur Singh");
						      	result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									Candidate.setAmount(7000000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(10000);
										System.out.println("option a =77%\n" + "option b = 3%\n" + "option c = 20%\n" + "option d = 10%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(7000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
											return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Charles Babbage\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
									result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(7000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (aud_phone != 0) {
												aud_phone = 0;
												Thread.sleep(1000);
												System.out.println("option a = 77%\n" + "option b = 3%\n" + "option c = 10%\n" + "option d = 20%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Charles Babbage\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										                  result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(7000000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(10000);
										System.out.println("option a = 77%\n" + "option b = 3%\n" + "option c = 20%\n" + "option d = 10%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(7000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println("a.Charles Babbage\n"+
										                   "b.Lal Bahaudur Singh");
										      result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Charles Babbage\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										                  result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.Charles Babbage\n"+
								                   "b.Lal Bahaudur Singh");
								            	result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											Candidate.setAmount(7000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (aud_phone != 0) {
												aud_phone = 0;
												Thread.sleep(1000);
												System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Charles Babbage\n"+
										                   "b.Lal Bahaudur Singh \n"+
										                   "c.B.R.Ambedkar\n"+
										                   "d.Sangolli Rayanna");
										                  result = sc.next();
												if (result.equalsIgnoreCase("a")) {
													Candidate.setAmount(7000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					//changes in line 122
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println("a.Charles Babbage\n"+
				                   "b.Lal Bahaudur Singh \n"+
				                   "c.B.R.Ambedkar\n"+
				                   "d.Sangolli Rayanna");
				                result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							Candidate.setAmount(7000000);
							return true;
						}
					}

				}
return false;
			}
			public static boolean fetchQuestion10(String name)throws Exception {
				System.out.println("10.Which is the heavier metal ?");
				System.out.println("a.Copper\n"+
				                   "b.Aluminium \n"+
				                   "c.Gold\n"+
				                   "d.Silver\n"
				                   + "e.Life-line");
				result=sc.next();
				if(result.equalsIgnoreCase("c")) {
					Candidate.setAmount(10000000);
					return true;
				}
				else if (result.equalsIgnoreCase("e")) {
					if (count_life_line > 0) {
						count_life_line--;
						System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result2 = sc.next();
						if (result2.equalsIgnoreCase("a")) {
							if (aud_phone != 0) {
								aud_phone = 0;
								Thread.sleep(1000);
								System.out.println("option a = 10%\n" + "option b = 45%\n" + "option c = 55%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50\n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
								                   "b.Aluminium \n"+
								                   "c.Gold");
								           result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												Candidate.setAmount(10000000);
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Copper\n"+
										                   "b.Aluminium \n"+
										                   "c.Gold\n"+
										                   "d.Silver");
										                  result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(10000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
												+ "b. 50-50 \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println(
										                   "b.Aluminium \n"+
										                   "c.Gold");
										          result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(10000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Copper\n"+
										                   "b.Aluminium \n"+
										                   "c.Gold\n"+
										                   "d.Silver");
										         	result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
						else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
						                   "b.Aluminium \n"+
						                   "c.Gold");
						      	result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									Candidate.setAmount(10000000);
									return true;
								} else {
									return false;
								}

							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(1000);
										System.out.println("option a = 0%\n" + "option b = 45%\n" + "option c =55%\n" + "option d = 10%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50 -- (not available) \n" + "c. skip");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("c")) {
											if(skip_cnt!=0) {
												
												return true;
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Copper\n"+
										                   "b.Aluminium \n"+
										                   "c.Gold\n"+
										                   "d.Silver");
										         result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										skip_cnt = 0;
										Candidate.setAmount(10000000);
										return true;
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (aud_phone != 0) {
												aud_phone = 0;
												Thread.sleep(1000);
												System.out.println("option a = 0%\n" + "option b = 45%\n" + "option c = 55%\n" + "option d = 10%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(10000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Copper\n"+
										                   "b.Aluminium \n"+
										                   "c.Gold\n"+
										                   "d.Silver");
										                   
												result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}

						else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								Candidate.setAmount(10000000);
								return true;
							} else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result3 = sc.next();
								if (result3.equalsIgnoreCase("a")) {
									if (aud_phone != 0) {
										aud_phone = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 45%\n" + "option c = 55%\n" + "option d = 10%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
												+ "b. 50-50  \n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if(result4.equalsIgnoreCase("b")) {
											if (cnt_50_50 != 0) {
												cnt_50_50 = 0;
												System.out.println("Select the options");
												System.out.println(
										                   "b.Aluminium \n"+
										                   "c.Gold\n");
										                   result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(10000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Copper\n"+
										                   "b.Aluminium \n"+
										                   "c.Gold\n"+
										                   "d.Silver");
										                   result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(10000000);
													return true;
												}
												else
													return false;
											}
										}
										//--- need code intervention
									}
								} else if (result2.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
								                   "b.Aluminium \n"+
								                   "c.Gold\n");
								                   
								      result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											Candidate.setAmount(10000000);
											return true;
										} else {
											return false;
										}
									}
									else {
										//
										System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
												+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
										System.out.println("Select the life line:");
										String result4 = sc.next();
										if (result4.equalsIgnoreCase("b")) {
											if (aud_phone != 0) {
												aud_phone = 0;
												Thread.sleep(1000);
												System.out.println("option a =10%\n" + "option b = 50%\n" + "option c = 30%\n" + "option d = 10%");
												System.out.println("Select the option");
												result = sc.next();
												if (result.equalsIgnoreCase("b")) {
													Candidate.setAmount(10000000);
													return true;
												} else {
													return false;
												}
											}
											else {
												System.out.println("You have no life line left. Please select an option:");
												System.out.println("a.Copper\n"+
										                   "b.Aluminium \n"+
										                   "c.Gold\n"+
										                   "d.Silver");
										                   	result = sc.next();
												if (result.equalsIgnoreCase("c")) {
													Candidate.setAmount(1000000);
													return true;
												}
												else
													return false;
											}
										}
									}
								}
							}
						}
					}
					else {
						System.out.println("You have no life line left. Please select an option:");
						System.out.println("a.Copper\n"+
				                   "b.Aluminium \n"+
				                   "c.Gold\n"+
				                   "d.Silver");
				                   	result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							Candidate.setAmount(1000);
							return true;
				}
			}
				}
	return false;
	}	
}