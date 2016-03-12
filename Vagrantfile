# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.synced_folder "hw1/", "/home/vagrant/hw1"
  config.vm.provider "virtualbox" do |v|
    v.memory = 2048
  end
  config.vm.provision "shell", inline: <<-SHELL
    sudo apt-get update
    sudo apt-get upgrade -y
    sudo apt-get install -y vim curl wget telnet htop nmon
    wget --no-check-certificate https://github.com/aglover/ubuntu-equip/raw/master/equip_java8.sh && bash equip_java8.sh
    wget --no-check-certificate https://github.com/aglover/ubuntu-equip/raw/master/equip_maven3.sh && bash equip_maven3.sh
    sudo echo "PATH=$PATH:/opt/maven/bin" >> /etc/profile.d/maven.sh
    ##
    # Insert your command here


    ##
    #
  SHELL
end
