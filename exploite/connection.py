import socket

mysocket=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
mysocket.connect(('sca.univh2c.ma',443))
cmd='GET https://sca.univh2c.ma/cas/login?service=https%3A%2F%2Fe-learning.univh2c.ma%2F/page1.html HTTP/1.0\r\n\r\n'.encode()
mysocket.send(cmd)

while True:
    data=mysocket.recv(1000)
    if len(data)<1:
        break
    print(data.decode(),end='')

mysocket.close()    